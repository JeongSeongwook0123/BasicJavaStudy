package com.example.basicjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.basicjava.databinding.ActivityCalculatorBinding;

import java.util.ArrayList;

/**
 * Todo.. 예외처리
 * case 1: 0으로 나누는 경우
 * case 2: 연산자만 연속으로 입력하는 경우
 * */
public class CalculatorActivity extends AppCompatActivity {
    private ActivityCalculatorBinding binding;
    private static Double saveNum = 0.0;
    private static Double operResult = 0.0;
    private static String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewInit();
    }

    private void viewInit() {

        Button[] btnCal = {
                binding.btnPlus, binding.btnMinus,
                binding.btnMultiplication, binding.btnDivision,
                binding.btnClear, binding.btnEnter};

        for (int i = 0; i < btnCal.length; i++) {

            int innerI = i;
            btnCal[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        switch (innerI) {
                            case 0: //plus
                            {
                                saveNum = Double.valueOf(binding.editInput.getText().toString());
                                operResult += saveNum;
                                operator = "+";
                                binding.editInput.setText("");
                                Log.d("tjddnr1", operResult.toString());
                                break;
                            }
                            case 1: //minus
                            {
                                saveNum = Double.valueOf(binding.editInput.getText().toString());
                                operResult = saveNum - operResult;
                                operator = "-";
                                binding.editInput.setText("");
                                Log.d("tjddnr2", operResult.toString());
                                break;
                            }
                            case 2: //multiplication
                            {
                                if (operResult == 0.0) operResult = 1.0;
                                saveNum = Double.valueOf(binding.editInput.getText().toString());
                                operResult *= saveNum;
                                operator = "*";
                                binding.editInput.setText("");
                                Log.d("tjddnr3", operResult.toString());
                                break;
                            }
                            case 3: //division
                            {
                                if (operResult == 0.0) operResult = 1.0;
                                saveNum = Double.valueOf(binding.editInput.getText().toString());

                                operResult = saveNum / operResult;
                                operator = "/";
                                binding.editInput.setText("");

                                break;
                            }
                            case 4: //All Clear
                            {
                                binding.editInput.setText("");
                                operator = "";
                                operResult = 0.0;
                                saveNum = 0.0;
                                Log.d("tjddnr5", operResult.toString());
                                break;
                            }
                            case 5: {
                                saveNum = Double.valueOf(binding.editInput.getText().toString());
                                switch (operator) {
                                    case "+": {
                                        operResult += saveNum;
                                        break;
                                    }
                                    case "-": {
                                        operResult -= saveNum;
                                        break;
                                    }
                                    case "*": {
                                        operResult *= saveNum;
                                        break;
                                    }
                                    case "/": {
                                        if (saveNum != 0.0) {
                                            operResult = operResult / saveNum;
                                            operator = "/";
                                            binding.editInput.setText("");
                                        } else {
                                            Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                                        }

                                        break;
                                    }
                                }

                                binding.editInput.setText(operResult.toString());
                                operResult = 0.0;
                                binding.editInput.setSelection(binding.editInput.getText().toString().length());
                                Log.d("tjddnr6", operResult.toString());
                                break;
                            }
                        }
                    }catch (NumberFormatException e) {
                        Toast.makeText(getApplicationContext(),"숫자를 입력 해 주세요.",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}