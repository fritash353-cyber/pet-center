package classes;

import interfaces.Cadastravel;
import interfaces.Notificavel;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


/**
 * Representa um Animal no sistema da clínica veterinária.
 * Implementa as interfaces Cadastravel e Notificavel.
 */
public class Animal implements Cadastravel, Notificavel{
    private int id;
    private String nome;
    private int idade;
    private Sexo sexo;
    private double peso;
    private LocalDate dataNascimento;

    private Cliente cliente;
    private Especie especie;
    private List<Tratamento> tratamentos;
    private List<Consulta> consultas;

    
    public Animal(int id, String nome, int idade, Sexo sexo, double peso,
                  LocalDate dataNascimento, Cliente cliente, Especie especie){
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }

        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida.");
        }

        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido.");
        }

        if (cliente == null) {
            throw new exceptions.AnimalSemDonoException("Não é possível cadastrar um animal sem um dono");
        }

        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.cliente = cliente;
        this.especie = especie;
        this.tratamentos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    // getters e setters: 
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    /**
     * alterar o nome de animal
     * @param nome o novo nome do animal não pode ser nulo ou vazio.
     * @throws IllegalArgumentException Se o nome for nulo ou vazio.
     */
    public void setNome(String nome){
        if (nome == null || nome.isBlank()) {
        throw new IllegalArgumentException("Nome inválido.");
    }
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if(idade > 0){
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }

    public Sexo getSexo() {
    return sexo;
    }

    public void setSexo(Sexo sexo) {
    this.sexo = sexo;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Especie getEspecie(){
        return especie;
    }

    public void setEspecie(Especie especie){
        this.especie = especie;
    }

    public List<Tratamento> getTratamentos(){
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos){
        this.tratamentos = tratamentos;
    }

    public List<Consulta> getConsultas(){
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas){
        this.consultas =  consultas;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**1 @param animal realiza 1 ou mais tratamento 
     * @throws IllegalArgumentException Se o tratamento fornecido for nulo
    */
    public void adicionarTratamento(Tratamento tratamento) {

    if (tratamento == null) {
        throw new IllegalArgumentException("Tratamento inválido.");
    }

    tratamentos.add(tratamento);
    }

    /**
 * Adiciona uma consulta ao histórico do animal.
 *
 * @param consulta Consulta a ser adicionada.
 * @throws IllegalArgumentException Se a consulta for nula.
 */
    public void adicionarConsulta(Consulta consulta) {

    if (consulta == null) {
        throw new IllegalArgumentException("Consulta inválida.");
    }

    consultas.add(consulta);
    }


    /**
 * Exibe os dados do animal formatados.
 *
 * @return String com nome, idade, sexo, peso, espécie e tutor.
 */
    public String visAnimal(){
        return "Nome: " + nome
        + "\nIdade: " + idade
        + "\nSexo: " + sexo
        + "\nPeso: " + peso
        + "\nEspécie: " + especie.getNome_esp()
        + "\nTutor: " + cliente.getNome();
    }

    /**
     * Retorna os dados do animal em string.
     * @return String formatada contendo a ficha cadastral básica do animal.
     */
    public String conAnimal(){
        return visAnimal();
    }

    @Override 
    public void cadastrar() {
        System.out.println("Animal cadastrado.");
    }

    @Override 
    public void alterar() {
        System.out.println("Animal alterado.");
    }

    @Override 
    public void excluir() {
        System.out.println("Animal excluído.");
    }

    @Override
    public Object consultar(int id){
        if (this.id == id) {
        return this;
    }
        return null;
    }

    @Override 
    public void enviarNotificacao(String mensagem) {
        System.out.println(mensagem);
    }
}