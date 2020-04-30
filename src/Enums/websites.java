package Enums;

public class websites {
    enum popularWebsites{
        GOOGLE("www.google.com"),
        FACEBOOK("www.facebook.com"),
        YAHOO("www.yahoo.com"),
        ;
     private String s;
        popularWebsites(String s) {
            this.s=s;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
    }

    public static void main(String[] args) {
        for(popularWebsites web : popularWebsites.values()){
            System.out.println(web+" = "+web.getS());
        }
    }


}
