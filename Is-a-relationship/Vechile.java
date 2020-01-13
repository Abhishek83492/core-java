class Vechile
{
    String color;
    String model;
    String company;
    double rate;
    double chachisno;
   
    Vechile() {};
    void setColor(String color)
    {
        this.color=color;
    }
    void setModel(String model)
    {
        this.model=model;
    }
    void setCompany(String company)
    {
         this.company=company;
    }
    void setRate(double rate)
    {
         this.rate=rate;
    }
    void setChachisno(double chachisno)
    {
         this.chachisno=chachisno;
    }
    String getColor()
    {
         return color;
    }
     String getModel()
     {
         return model;
     }
     String getCompany()
     {
         return company;
      }
      double getRate()
      {
          return rate;
      }
      double getChachisno()
     {
        return chachisno;
     }
}       