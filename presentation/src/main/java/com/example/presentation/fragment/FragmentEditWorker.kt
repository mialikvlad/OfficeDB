package com.example.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.presentation.databinding.EditWorkerBinding

class FragmentEditWorker : Fragment() {

    private var _binding: EditWorkerBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return EditWorkerBinding.inflate(inflater, container, false)
            .also {
                _binding = it
            }
            .root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}