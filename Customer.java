
class Customer{

  private String CustomerName;
  private int CustomerMobileNo;

  public Customer(String CustomerName, int CustomerMobileNo){

    this.CustomerName = CustomerName;
    this.CustomerMobileNo = CustomerMobileNo;

  }

  public void setCustomerName(String CustomerName){

    this.CustomerName = CustomerName;

  }

  public String getCustomerName(){

    return this.CustomerName;

  }

  public void setCustomerMobileNo(int CustomerMobileNo){

    this.CustomerMobileNo = CustomerMobileNo;
    
  }

  public int getCustomerMobileNo(){

    return this.CustomerMobileNo;
    
  }



}