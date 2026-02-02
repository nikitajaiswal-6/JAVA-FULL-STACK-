package org.question.Q10;

public class ReffrenceReply {


    RefferanceBean refferanceBean;

    public void setRefferanceBean(RefferanceBean refferanceBean) {
        this.refferanceBean = refferanceBean;
    }

    public ReffrenceReply() {
    }

    public void reply() throws InterruptedException {
        System.out.println("Msg Received Wait 3s");
        Thread.sleep(3000);
        refferanceBean.KaHalBaaHo();
        System.out.println("Msg Sent Wait for 3 Sec And Watch");
        Thread.sleep(3000);
        System.out.println("Mast Ba ho hmr jaan 😁 tu batwa apna haal");
    }

}
