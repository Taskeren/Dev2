package task.dev2.util;

public class DataPair<V1, V2> {

	V1 v1;
	V2 v2;
	
	public DataPair() {
		this(null, null);
	}
	
	public DataPair(V1 t1, V2 t2) {
		this.v1 = t1;
		this.v2 = t2;
	}
	
	public static DataPair create(Object v1, Object v2) {
		return new DataPair(v1, v2);
	}

	public V1 getT1() {
		return v1;
	}

	public void setT1(V1 t1) {
		this.v1 = t1;
	}

	public V2 getT2() {
		return v2;
	}

	public void setT2(V2 t2) {
		this.v2 = t2;
	}
	
	public boolean checkType(Class<?> c1, Class<?> c2) {
		return c1.isInstance(v1) && c2.isInstance(v2);
	}
	
}
