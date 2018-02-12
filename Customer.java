
class Customer{

  private String CustomerName;
  private Integer CustomerMobileNo;

  public Customer(String CustomerName, Integer CustomerMobileNo){

    this.CustomerName = CustomerName;
    this.CustomerMobileNo = CustomerMobileNo;

  }

  public void setCustomerName(String CustomerName){

    this.CustomerName = CustomerName;

  }

  public String getCustomerName(){

    return this.CustomerName;

  }

  public void setCustomerMobileNo(Integer CustomerMobileNo){

    this.CustomerMobileNo = CustomerMobileNo;
    
  }

  public Integer getCustomerMobileNo(){

    return this.CustomerMobileNo;
    
  }



}