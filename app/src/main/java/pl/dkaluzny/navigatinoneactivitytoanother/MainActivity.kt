package pl.dkaluzny.navigatinoneactivitytoanother

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goSecondId.setOnClickListener {

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", "Bonni")
            intent.putExtra("char", 'C')
            intent.putExtra("Int", 23)

            startActivity(intent)
        }
    }
}
