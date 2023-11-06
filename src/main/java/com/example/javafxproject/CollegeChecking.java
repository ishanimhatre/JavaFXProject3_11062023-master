package com.example.javafxproject;

public class CollegeChecking extends Checking{

    private Campus campus; //campus code
    private static final double NO_FEE = 0.0;
    public CollegeChecking(Profile holder, double balance, Campus campus){
        super(holder, balance);
        this.campus = campus;
    }

    /**
     * defult constructor
     */
    public CollegeChecking() {

    }

    /**
     * Method to find monthly fee for College Checking
     * @return no fee
     */
    @Override
    public double monthlyFee() {
        return NO_FEE;
    }

    /**
     * If both accounts are College Checking, compare their holders, otherwise compare class name
     * @param account for account type
     * @return integer that determines comparison value
     */
    @Override
    public int compareTo(Account account) {
        if(account instanceof CollegeChecking){
            return super.compareTo(account);
        }
        else {
            return this.getClass().getName().compareTo(account.getClass().getName());
        }
    }

    /**
     * To String method for ouput of College Checking including holder, balance, and campus in correct format
     * @return String for output of College Checking account
     */

    @Override
    public String toString(){
        return "College Checking::" +holder.toString() + "::Balance " + String.format("$%,.2f", balance) + "::" + campus.name();
    }

        /**
         * compare two instances of  CollegeChecking class to determine if equal attributes
         * @param account type of account with holder
         * @return true if account attribures equal, false if not
         */
    @Override
    public boolean equals(Account account) {
        if (account instanceof CollegeChecking) {
            return super.equals(account);
        } else return false;
    }
}
