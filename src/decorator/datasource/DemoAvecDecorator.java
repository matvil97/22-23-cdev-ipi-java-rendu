package decorator.datasource;

public class DemoAvecDecorator {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new Compressor(new Encryptor(new FileDataSource("OutputDemo.txt")));
        

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");
    }
}