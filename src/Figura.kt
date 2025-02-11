abstract class Figura(val nombre: String, val color: String) {


    protected abstract fun area(): Double

    protected abstract fun perimetro(): Double
}