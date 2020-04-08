package ThreadLocal;

public class UserContext {
	
	static ThreadLocal<String> threadLocal = new ThreadLocal<String>() {
													public String initialValue() {
														return null;
															}
														};
	
																
		public static String getUsername() {
				return threadLocal.get();
		}
	
		public static void setUsername(String username) {
			threadLocal.set(username);
	}
		
		public static void clear() {
			threadLocal.remove();
		}

}
