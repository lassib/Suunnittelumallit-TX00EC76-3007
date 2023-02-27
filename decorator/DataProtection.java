package decorator;

public class DataProtection implements  IDataAccess{

    protected IDataAccess dataAccess;

    public DataProtection(IDataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public IDataAccess readData() {
        return dataAccess.readData();
    }

}
