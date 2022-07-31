package com.example.appproject;

public class NewModelClass {
    private int Imageview;
    private String Textview1;
    private String Textview2;
    private String Textview3;


    NewModelClass(int Imageview,String Textview1,String Textview2,String Textview3){
        this.Imageview=Imageview;
        this.Textview1=Textview1;
        this.Textview2=Textview2;
        this.Textview3=Textview3;
    }

    public int getImageview() {
        return Imageview;
    }

    public void setImageview(int imageview) {
        Imageview = imageview;
    }

    public String getTextview1() {
        return Textview1;
    }

    public void setTextview1(String textview1) {
        Textview1 = textview1;
    }

    public String getTextview2() {
        return Textview2;
    }

    public void setTextview2(String textview2) {
        Textview2 = textview2;
    }



    public String getITextview3() {
        return Textview3;
    }

    public void setTextview3(String textview3) {
        Textview3 = textview3;
    }
}
