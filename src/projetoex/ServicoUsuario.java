package projetoex;

public class ServicoUsuario {
    public static void print(String nome, CallBack callBack) {
        callBack.call(nome + " é isso");
    }

    public static void main(String[] args) {
        print("Ana", new CallBack() {
            @Override
            public void call(String call) {
                System.out.println(call);
            }
        });
        print("Aline", (call)->{
            System.out.println(call);
        });
        print("Bruna", System.out::println);
    }
}