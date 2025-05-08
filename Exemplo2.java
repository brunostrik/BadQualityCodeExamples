/*
 * Este exemplo foi desenvolvido para apresentar os seguintes problemas de qualidade de código:
 * - Code smell: GOD CLASS ou LARGE CLASS
 * - Code smell: DATA CLASS
 */

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    // Dados de usuários
    private List<String> userNames = new ArrayList<>();
    private List<String> userEmails = new ArrayList<>();
    private List<String> userPasswords = new ArrayList<>();

    // Dados financeiros
    private List<Double> userBalances = new ArrayList<>();

    // Configurações do sistema
    private String systemName = "Sistema Completo";
    private String systemVersion = "1.0.0";

    // Gerenciamento de usuários
    public void addUser(String name, String email, String password) {
        userNames.add(name);
        userEmails.add(email);
        userPasswords.add(password);
        userBalances.add(0.0); // Inicializa saldo com zero
    }

    public void removeUser(String email) {
        int index = userEmails.indexOf(email);
        if (index != -1) {
            userNames.remove(index);
            userEmails.remove(index);
            userPasswords.remove(index);
            userBalances.remove(index);
        }
    }

    public boolean authenticate(String email, String password) {
        int index = userEmails.indexOf(email);
        return index != -1 && userPasswords.get(index).equals(password);
    }

    // Gerenciamento financeiro
    public void deposit(String email, double amount) {
        int index = userEmails.indexOf(email);
        if (index != -1) {
            userBalances.set(index, userBalances.get(index) + amount);
        }
    }

    public void withdraw(String email, double amount) {
        int index = userEmails.indexOf(email);
        if (index != -1 && userBalances.get(index) >= amount) {
            userBalances.set(index, userBalances.get(index) - amount);
        }
    }

    public double getBalance(String email) {
        int index = userEmails.indexOf(email);
        return index != -1 ? userBalances.get(index) : 0.0;
    }

    // Configurações do sistema
    public String getSystemInfo() {
        return "Nome: " + systemName + ", Versão: " + systemVersion;
    }

    public void updateSystemVersion(String version) {
        this.systemVersion = version;
    }
}
