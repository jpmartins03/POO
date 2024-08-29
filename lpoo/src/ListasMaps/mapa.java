package ListasMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class mapa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map <String, Integer> map = new HashMap<>();
		
		for(int i = 0; i<5; i++) {
			String obj_key = sc.next();
			int obj_value = sc.nextInt();
			map.put(obj_key, obj_value);
		}
		String key = sc.next();
		
		System.out.printf("Valor da chave(%s)=%d\n", key, map.get(key));
		System.out.printf("Quantidade de elementos: %d\n", map.size());
		//System.out.println(map);
		sc.close();
	}
}
