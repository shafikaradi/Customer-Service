
class CustomerService{

    private int fixedArraySize = 100;

    private Customer [] customers = new Customer[fixedArraySize];

    public CustomerService(Customer [] customers){

        this.customers = customers;

    }

    public CustomerService(){

    }

    public void addCustomerToArray(Customer customer){

        for(int i = 0; i < fixedArraySize; i++){

            if(customers[i] == null){

                customers[i] = customer;
 
                return;

            }

        }

    }


    public void findCustomerMobileNoInArray(int CustomerMobileNo){

        for(int i = 0; i < fixedArraySize; i++){

            if(customers[i] == null){

                break;

            }if(customers[i].getCustomerMobileNo() == CustomerMobileNo){

                System.out.print("The Customer "+ customers[i].getCustomerName() +" was found");
                return;
            }else{

                System.out.print("Nothing was found");
                return;
            }

        }

    }




}