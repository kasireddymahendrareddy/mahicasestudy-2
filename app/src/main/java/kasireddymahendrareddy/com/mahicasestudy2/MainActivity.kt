package kasireddymahendrareddy.com.kasireddymahendrareddy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnEvaluate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEvaluate = findViewById(R.id.btnEvaluate)
        tvResult = findViewById(R.id.tvResult)

        btnEvaluate.setOnClickListener {
            evaluateLLM()
        }
    }

    private fun evaluateLLM() {

        val llm1 = "Artificial Intelligence helps automate tasks."
        val llm2 = "AI is capable of learning from data and solving problems."

        val accuracy1 = 92
        val coherence1 = 90
        val perplexity1 = 18

        val accuracy2 = 95
        val coherence2 = 94
        val perplexity2 = 12

        val betterModel =
            if ((accuracy2 > accuracy1) &&
                (coherence2 > coherence1) &&
                (perplexity2 < perplexity1))
                "LLM 2"
            else
                "LLM 1"

        tvResult.text =
            """
LLM Evaluation Study

Sample Prompt:
Explain Artificial Intelligence.

------------------------------------

LLM 1 Output:
$llm1

Accuracy : $accuracy1%
Coherence : $coherence1%
Perplexity : $perplexity1

------------------------------------

LLM 2 Output:
$llm2

Accuracy : $accuracy2%
Coherence : $coherence2%
Perplexity : $perplexity2

------------------------------------

Best Model:
$betterModel
            """.trimIndent()
    }
}