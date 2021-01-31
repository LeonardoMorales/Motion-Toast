package dev.leonardom.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.leonardom.toast.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMotionToast.setOnClickListener {
            MotionToast.createToast(
                this,
                "Operación Exitosa",
                "Operación realizada de forma exitosa",
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.SHORT_DURATION,
                null
            )
        }

        binding.btnColorMotionToast.setOnClickListener {
            MotionToast.createColorToast(
                this,
                "Operación Fallida",
                "Hubo un error",
                MotionToast.TOAST_ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                null
            )
        }

        binding.btnDarkToast.setOnClickListener {
            MotionToast.darkToast(
                this,
                "Información Incompleta",
                "Complete todos los campos obligatorios",
                MotionToast.TOAST_WARNING, //Success, Error, Warning, Info, Delete
                MotionToast.GRAVITY_BOTTOM, // Bottom, Center, Top
                MotionToast.LONG_DURATION, // Long, Short
                null
            )
        }

        binding.btnDarkColorToast.setOnClickListener {
            MotionToast.darkColorToast(
                this,
                "Información Eliminada",
                "Datos borrados de forma correcta",
                MotionToast.TOAST_DELETE, //Success, Error, Warning, Info, Delete
                MotionToast.GRAVITY_BOTTOM, // Bottom, Center, Top
                MotionToast.LONG_DURATION, // Long, Short
                null
            )
        }

    }
}











