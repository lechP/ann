package com.lpi.ann.neuralnet;

import com.lpi.ann.neuralnet.math.ActivationFunction;
import java.util.Random;

public class Neuron {


    private double output;
    private double outputBeforeActivation;
    private double[] weights;
    private double[] inputs;
    private double bias;
    private ActivationFunction activationFunction;

    public Neuron(int inputsCount, ActivationFunction activationFunction) {
        this.weights = new double[inputsCount + 1];
        this.inputs = new double[inputsCount];
        this.activationFunction = activationFunction;
        resetWeights();
    }

    private void resetWeights() {
        Random r = new Random();
        for (double w : weights) {
            w = r.nextDouble();
        }
    }

    public void setInputs(double[] values) {
        assert values.length == inputs.length;
        System.arraycopy(values, 0, inputs, 0, values.length);
    }

}
