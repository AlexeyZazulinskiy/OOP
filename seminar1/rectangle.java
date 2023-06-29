package OOP.seminar1;

/*
 * Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
 */

public class rectangle {
    private int rectHeight;
    private int rectWidth;

    public rectangle(int rectHeight, int rectWidth) {
        this.rectHeight = rectHeight;
        this.rectWidth = rectWidth;
    }

    public rectangle(int rectHeight) {
        this.rectHeight = rectHeight;
        this.rectWidth = 10;
    }

    public rectangle() {
        this.rectHeight = 10;
        this.rectWidth = 10;
    }

    public int getRectHeight() {
        return rectHeight;
    }

    public int getRectWidth() {
        return rectWidth;
    }

    public void setRectHeight(int rectHeight) {
        this.rectHeight = rectHeight;
    }

    public void setRectWidth(int rectWidth) {
        this.rectWidth = rectWidth;
    }

    public int calculateArea() {
        return rectHeight * rectWidth;
    }

    public int calculatePerimeter() {
        return (rectHeight + rectWidth) * 2;
    }
}
