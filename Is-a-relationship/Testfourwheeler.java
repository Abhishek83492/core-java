class Testfourwheeler 
 {
    public static void main(String[] args)
    {
        Fourwheeler f = new Fourwheeler();
        f.setColor("Violet");
        f.setModel(5.1);
        f.setCompany("Mahindra");
        f.setVechilename("XUV");
        f.setChachisno(7.4);
        f.setRate(5.0);
    System.out.println("_______________________________________________________________");
    System.out.println("Vechile Company is:"+f.getCompany());
    System.out.println("Vechile Model is:"+f.getModel());
    System.out.println("Vechile Color is:"+f.getColor());
    System.out.println("Vechile Vechilename is:"+f.getVechilename());
    System.out.println("Vechile chachisno is:"+f.getChachisno());
    System.out.println("Vechile Rate is:"+f.getRate());
    System.out.println("_______________________________________________________________");
}
}