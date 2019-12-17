package interfaces;

public interface BaseDaoInteface<Entity>{
	//public List<Clazz> selectAll();
	public abstract void insertOne(Entity entity);
	public abstract void updateOne(Entity entity, int id);
	public abstract void delete(String id);

	/*
	 * public default String seperateByComma(String[] field, int option) { int n =
	 * field.length - 1; StringBuilder ss = new StringBuilder(); for (int i = 0; i
	 * <= n; i++) { if (option == 1) ss.append(field[i]); if (option == 0)
	 * ss.append("?"); if (i != n) { ss.append(","); } } return ss.toString(); }
	 */
	
}
