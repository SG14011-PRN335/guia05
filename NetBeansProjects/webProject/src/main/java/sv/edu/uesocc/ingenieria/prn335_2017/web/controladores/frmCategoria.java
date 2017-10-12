/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.CategoriaFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Categoria;

/**
 *
 * @author usuario
 */


    
@Named
@javax.faces.bean.ViewScoped
public class frmCategoria implements Serializable {

    @EJB
    private CategoriaFacadeLocal categoriaEJB;    
    private Categoria categoria;
    private List<Categoria> categorias;
    
    public List<Categoria> getCategorias() {
        return categorias;
    }
    
    @PostConstruct
    public void init(){
        categorias = categoriaEJB.findAll();
        categoria = new Categoria();
        categoria.setActivo(false);
        categoria.setDescripcion("");
        categoria.setNombre("");
        categoria.setIdCategoria(null);
    }

    public CategoriaFacadeLocal getCategoriaEJB() {
        return categoriaEJB;
    }

    public void setCategoriaEJB(CategoriaFacadeLocal categoriaEJB) {
        this.categoriaEJB = categoriaEJB;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String guardar(){
        if (categoria != null ){
            categoriaEJB.create(categoria);
            categorias =categoriaEJB.findAll();
        }else{
            System.out.println("hola");
        }
        categoria = new Categoria();
        return "guardar";
    }
    
}
