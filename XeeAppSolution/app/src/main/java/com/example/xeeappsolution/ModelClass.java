package com.example.xeeappsolution;

public class ModelClass {

    private int imageView,cardImage;
    private String textView1;
    private String textView2;
    private String textView3;

    ModelClass(int imageView,String textView1,String textView2,String textView3){
        this.imageView=imageView;
        this.textView1=textView1;
        this.textView2=textView2;
        this.textView3=textView3;


    }


    public int getImageView() {
        return imageView;
    }

    public int getCardImage() {
        return cardImage;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }
}
