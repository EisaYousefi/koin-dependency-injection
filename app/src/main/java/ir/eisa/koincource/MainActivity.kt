package ir.eisa.koincource
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import ir.eisa.koincource.container.BaseApplication
import ir.eisa.koincource.data.model.User
import ir.eisa.koincource.databinding.ActivityMainBinding
import ir.eisa.koincource.ui.MainViewModel
import ir.eisa.koincource.util.showMessage
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val baseApp = BaseApplication()
        baseApp.car.getCar()
        baseApp.main.getDemo()
        baseApp.singletonClass.getSingleton()
        mainViewModel.getDemo()
        baseApp.mainUser.getAllUser()
        baseApp.users.getUser()

        lifecycleScope.launchWhenStarted {
            mainViewModel.getPost().catch { e->
                Log.d("main", "onCreate: ${e.message}")
            }.collect {response->
                Log.d("main", "onCreate: $response ")
            }
        }
        insertToRoomDatabase()
        lifecycleScope.launchWhenStarted {
            mainViewModel.getAllUser.catch {e->
                Log.d("main", "onCreate:${e.message} ")
            }.collect {
                Log.d("main", "onCreate: $it")
            }
        }
    }

    private fun insertToRoomDatabase() {
        binding.apply {
            save.setOnClickListener {
                if(!TextUtils.isEmpty(name.text.toString())){
                    mainViewModel.insert(User(name.text.toString()))
                    showMessage("Data added successfully..")
                }else{
                    showMessage("please fill all the fields..")
                }
            }
        }
    }

}

