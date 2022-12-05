import java.util.Stack;

// Структура данных для хранения узла бинарного дерева
class Node
{
    char data;
    Node left, right;

    Node(char data)
    {
        this.data = data;
        this.left = this.right = null;
    }

    Node(char data, Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Main
{
    // Функция для проверки, является ли данный токен оператором
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Печатаем постфиксное выражение для дерева выражений
    public static void postorder(Node root)
    {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    // Печатаем инфиксное выражение для дерева выражений
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }

        // если текущий токен является оператором, вывести открывающую скобку
        if (isOperator(root.data)) {
            System.out.print("(");
        }

        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);

        // если текущий токен является оператором, вывести закрывающую скобку
        if (isOperator(root.data)) {
            System.out.print(")");
        }
    }

    // Функция для построения дерева выражений из заданного постфиксного выражения
    public static Node construct(String postfix)
    {
        // базовый вариант
        if (postfix == null || postfix.length() == 0) {
            return null;
        }

        // создаем пустой stack для хранения указателей дерева
        Stack<Node> s = new Stack<>();

        // обход постфиксного выражения
        for (char c: postfix.toCharArray())
        {
            // если текущий токен является оператором
            if (isOperator(c))
            {
                // извлекаем из stack два узла `x` и `y`
                Node x = s.pop();
                Node y = s.pop();

                // построить новое бинарное дерево, корнем которого является оператор, а
                // левый и правый дочерние элементы указывают на `y` и `x` соответственно
                Node node = new Node(c, y, x);

                // поместить текущий узел в stack
                s.add(node);
            }
            // если текущий токен является операндом, создаем новый узел бинарного дерева
            // чей корень является операндом и помещаем его в stack
            else {
                s.add(new Node(c));
            }
        }

        // указатель на корень дерева выражений остается в stack
        return s.peek();
    }

    public static void main(String[] args)
    {
        String postfix = "ab+cde+**";
        Node root = construct(postfix);

        System.out.print("Postfix Expression: ");
        postorder(root);

        System.out.print("\nInfix Expression: ");
        inorder(root);
    }
}