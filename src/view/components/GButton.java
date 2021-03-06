package view.components;

import java.util.HashSet;
import java.awt.*;
import java.awt.event.ActionListener;

public class GButton extends Component {

    //Variables
    private String text;
    private int x, y, width, height, borderSize, textXAllign, textYAllign;
    private Color borderColor, backgroundColor, textColor;
    private Font textFont;
    private HashSet<ActionListener> listeners;

    //Constructors
    public GButton(String text, int x, int y, int width, int height) {
        this.text = text;
        this.x = x;
        listeners = new HashSet<>();
        this.y = y;
        this.width = width;
        this.height = height;

        borderColor = textColor = Color.WHITE;
        backgroundColor = null;
        textXAllign = textYAllign = -1;
        textFont = new Font("Serif", Font.PLAIN, 12);

        setName(this.text + " Button");
    }

    //Methods
    public void addActionListener(ActionListener ls) {
        listeners.add(ls);
    }

    @Override
    public void paint(Graphics g) {
        //Creates g2d based on g
        Graphics2D g2d = (Graphics2D) g;

        //DrawBorder
        g2d.setColor(borderColor);
        g2d.setStroke(new BasicStroke(borderSize));
        g2d.drawRect(x, y, width, height);

        //DrawText
        if(textXAllign == -1)
            textXAllign = width * 1/9;
        if(textYAllign == -1)
            textYAllign = height * 3/4;

        g2d.setColor(textColor);
        g2d.setFont(textFont);
        g2d.drawString(text, x + borderSize + textXAllign, y + borderSize + textYAllign);

        //DrawBackground
        if(backgroundColor != null) {
            g2d.setColor(backgroundColor);
            g2d.fillRect(x + borderSize, y + borderSize, width - borderSize, height - borderSize);
        }

    }

    //Setters and getters
    public ActionListener[] getActionListeners() {
        return listeners.toArray(new ActionListener[0]);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    public int getTextXAllign() {
        return textXAllign;
    }

    public void setTextXAllign(int textXAllign) {
        this.textXAllign = textXAllign;
    }

    public int getTextYAllign() {
        return textYAllign;
    }

    public void setTextYAllign(int textYAllign) {
        this.textYAllign = textYAllign;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public Font getTextFont() {
        return textFont;
    }

    public void setTextFont(Font textFont) {
        this.textFont = textFont;
    }

}
