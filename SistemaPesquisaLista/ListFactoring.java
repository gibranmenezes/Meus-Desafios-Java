package SistemaPesquisaLista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListFactoring {


    private String path; //o usuario entra com o caminho do arquivo
    private List<String> list = new ArrayList<>();//sera a lista criada a partir do arquivo




    public ListFactoring() {
    }

    public ListFactoring(String path) {
        this.path = path;
    }

    // método que obtem a lista a partir do arquivo.
    public List<String> makeList(){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                line = br.readLine();
                list.add(line);
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return list;
    }

        public List<String> getList() {
        return this.list = list;
    }


}
