
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO {

    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();

    public void cadastrarProduto(ProdutosDTO produto) {
        // Implementar a parte de cadastro
        //conn = new conectaDAO().connectDB();
    }

    public ArrayList<ProdutosDTO> listarProdutos() {

        return listagem;
    }

}
