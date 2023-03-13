package main;

import main.controller.AlunoController;
import main.model.Aluno;
import main.model.Disciplina;
import main.service.AlunoService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class GerenciamentoPrincipal {

    AlunoService alunoService;
    AlunoController alunoController;
    public void selecionarDisciplinas(Long idAluno) throws Exception{

        Aluno aluno = alunoService.findAlunoById(idAluno);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Disciplina> disciplinasDisponiveis = (LinkedList<Disciplina>) aluno.getCurriculo().getDisciplinasDoCurriculo();
        LinkedList<Integer> idsDesejados = new LinkedList<Integer>();

        for (Disciplina disciplinaAtual:
             disciplinasDisponiveis) {
           System.out.println("Disciplna: "+disciplinaAtual.getNome()+" Código: "+disciplinaAtual.getId());

        }

        String entrada="";
        do{
            System.out.println("digite salvar a qualquer momento para finalizar as escolhas");
            System.out.println("digite o id das disciplinas que deseja se matricular: ");
            entrada = input.readLine();
            if(!entrada.equals("salvar")){
                idsDesejados.add(Integer.parseInt(entrada));
            }
                      
        }while (entrada.equals("salvar"));
       
        LinkedList<Disciplina> disciplinasSelecionadas = new LinkedList<>();

        for (Disciplina disciplinaAtual:
                disciplinasDisponiveis) {


        }


    }

    public static void main(String[] args) throws Exception {

        GerenciamentoPrincipal gerenciamentoPrincipal = new GerenciamentoPrincipal();
        gerenciamentoPrincipal.selecionarDisciplinas(Long.valueOf(1));



    }
}
