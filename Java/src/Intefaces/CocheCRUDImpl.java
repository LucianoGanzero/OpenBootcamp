package Intefaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public String save() {
        return "Estoy usando el metodo save";
    }

    @Override
    public String delete() {
        return "Estoy usando el metodo  delete";
    }

    @Override
    public String findAll() {
        return "Estoy usando el metodo findAll";
    }
}
