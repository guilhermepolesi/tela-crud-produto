/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author guilherme
 */
public class ProdutoController {
    
    private static ProdutoController instance;
    private List<Produto> productList;

    private ProdutoController() {
        productList = new ArrayList<>();
    }

    public static ProdutoController getInstance() {
        if (instance == null) {
            instance = new ProdutoController();
        }
        return instance;
    }

    public List<Produto> getList() {
        return productList;
    }
    
    public int obterNovoId() {
        Produto produto = productList.get(productList.size() - 1);
        int id = produto.getId() + 1;
        return id;
    }
    
    public Produto obterProdutoPorId(int id) {
        for (Produto produto : productList) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
    
}
