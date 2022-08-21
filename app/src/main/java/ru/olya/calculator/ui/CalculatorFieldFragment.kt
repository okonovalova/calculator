package ru.olya.calculator.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import ru.olya.calculator.databinding.FragmentCalculatorFieldBinding
import ru.olya.calculator.ui.model.CalculatorViewModel

class CalculatorFieldFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorFieldBinding
    private val viewModel: CalculatorViewModel by viewModels(
        ownerProducer = ::requireParentFragment
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCalculatorFieldBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initObservers()
    }

    private fun initListeners() {
        binding.resetButtonTextview.setOnClickListener {
            viewModel.onResetButtonTextviewClicked()
        }
        binding.numberOneTextview.setOnClickListener {
            viewModel.onNumberOneTextviewClicked()
        }
        binding.numberTwoTextview.setOnClickListener {
            viewModel.onNumberTwoTextviewClicked()
        }
        binding.numberThreeTextview.setOnClickListener {
            viewModel.onNumberThreeTextviewClicked()
        }
        binding.numberFourTextview.setOnClickListener {
            viewModel.onNumberFourTextviewClicked()
        }
        binding.numberFiveTextview.setOnClickListener {
            viewModel.onNumberFiveTextviewClicked()
        }
        binding.numberSixTextview.setOnClickListener {
            viewModel.onNumberSixTextviewClicked()
        }
        binding.numberSevenTextview.setOnClickListener {
            viewModel.onNumberSevenTextviewClicked()
        }
        binding.numberEightTextview.setOnClickListener {
            viewModel.onNumberEightTextviewClicked()
        }
        binding.numberNineTextview.setOnClickListener {
            viewModel.onNumberNineTextviewClicked()
        }
        binding.numberZeroTextview.setOnClickListener {
            viewModel.onNumberZeroTextviewClicked()
        }
        binding.operatorPlusTextview.setOnClickListener {
            viewModel.onOperatorPlusTextviewClicked()
        }
        binding.operatorMinusTextview.setOnClickListener {
            viewModel.onOperatorMinusTextviewClicked()
        }
        binding.operatorMultipleTextview.setOnClickListener {
            viewModel.onOperatorMultipleTextviewClicked()
        }
        binding.operatorDivideTextview.setOnClickListener {
            viewModel.onOperatorDivideTextviewClicked()
        }
        binding.calculateResultButtonTextview.setOnClickListener {
            viewModel.calculateResultButtonTextviewClicked()
        }
    }
    private fun initObservers() {
        viewModel.uiData.observe(viewLifecycleOwner) { result ->
            result?.let { binding.resultShowTextview.text = it }
        }
    }
}