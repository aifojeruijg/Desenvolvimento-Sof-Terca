package controllers;

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();




    // 1 - Alterar RETORNO do método  VOID > BOOLEAN
    // 2 - Percorrer a lista de registros
    // 3 - Perguntar se o CPF do cliente novo é igual ao cadastrado
    // public boolean cadastrar(Cliente cliente) {
    //     for (Cliente clienteCadastrado : clientes){
    //         if(clienteCadastrado.getCpf().equals(cliente.getCpf())){
    //             return false;
    //         }
    //     }
    //     clientes.add(cliente);
    //     return true;
    // }       

    public boolean cadastrar(Cliente cliente){

        if(buscarPorCpf(cliente.getCpf()) == null){
            clientes.add(cliente);
            return true;
        }
        return false;        
    }


    public ArrayList<Cliente> listar() {
        return clientes;
    }

    public Cliente buscarPorCpf(String cpf){
        for (Cliente clienteCadastrado : clientes) {
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

}
