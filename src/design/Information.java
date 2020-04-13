package design;


    public abstract class Information implements Employee {

        public String employeeDOB = "";

        public Information() {}

        public Information(String employeeDOB)
        {
            this.employeeDOB = employeeDOB;
        }
        public String employeeDOB()
        {
            return employeeDOB;
        }
    }

