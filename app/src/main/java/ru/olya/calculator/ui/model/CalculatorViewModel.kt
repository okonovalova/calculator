package ru.olya.calculator.ui.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CalculatorViewModel(application: Application) : AndroidViewModel(application) {

    private var result: Double = 0.00
    private val data : MutableLiveData<String> = MutableLiveData("0")
    val uiData: LiveData<String> = data
    var operator: String = ""

    private var str: String = ""

    fun onResetButtonTextviewClicked() {
        result = 0.00
        operator = ""
        str = ""
        data.postValue(result.toString())
    }
    fun onNumberOneTextviewClicked() {
        val digit = 1
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberTwoTextviewClicked() {
        val digit = 2
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberThreeTextviewClicked() {
        val digit = 3
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberFourTextviewClicked() {
        val digit = 4
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberFiveTextviewClicked() {
        val digit = 5
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberSixTextviewClicked() {
        val digit = 6
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberSevenTextviewClicked() {
        val digit = 7
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberEightTextviewClicked() {
        val digit = 8
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberNineTextviewClicked() {
        val digit = 9
        showDigit(digit)
        calculateResult(digit)
    }
    fun onNumberZeroTextviewClicked() {
        val digit = 0
        showDigit(digit)
        calculateResult(digit)
    }

    fun showDigit(digit: Int){
        str += "${digit}"
        data.postValue(str)
    }
    fun showOperator(){
        str += " ${operator} "
        data.postValue(str)
    }
    fun calculateResult(digit: Int) {
        if (operator.equals("")) {
            result = result * 10 + digit
        } else {
            when {
                operator.equals("+") -> result += digit
                operator.equals("-") -> result -= digit
                operator.equals("*") -> result *= digit
                operator.equals("/") -> result /= digit
                else -> return
            }
        }
    }

    fun onOperatorPlusTextviewClicked() {
        operator = "+"
        showOperator()
    }
    fun onOperatorMinusTextviewClicked() {
        operator = "-"
        showOperator()
    }
    fun onOperatorMultipleTextviewClicked() {
        operator = "*"
        showOperator()
    }
    fun onOperatorDivideTextviewClicked() {
        operator = "/"
        showOperator()
    }
    fun calculateResultButtonTextviewClicked() {
        data.postValue(result.toString())
        result = 0.00
        str = ""
        operator = ""
    }
}