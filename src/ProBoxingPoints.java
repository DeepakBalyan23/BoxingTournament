//Points POJO class
public class ProBoxingPoints implements Points{
	private int proFaceJab;
	private int proBodyJab;
	private int proFaceHook;
	private int proAllIllegalPunch;
	
	ProBoxingPoints(int faceJab, int proBodyJab, int proFaceHook, int proAllIllegalPunch){
		this.proFaceJab = faceJab;
		this.proBodyJab = proBodyJab;
		this.proFaceHook = proFaceHook;
		this.proAllIllegalPunch = proAllIllegalPunch;
	}

	public int getProFaceJab() {
		return proFaceJab;
	}

	public void setProFaceJab(int faceJab) {
		this.proFaceJab = faceJab;
	}

	public int getProBodyJab() {
		return proBodyJab;
	}

	public void setProBodyJab(int bodyJab) {
		this.proBodyJab = bodyJab;
	}

	public int getProFaceHook() {
		return proFaceHook;
	}

	public void setProFaceHook(int faceHook) {
		this.proFaceHook = faceHook;
	}

	public int getAllIllegalPunch() {
		return proAllIllegalPunch;
	}

	public void setAllIllegalPunch(int allIllegalPunch) {
		this.proAllIllegalPunch = allIllegalPunch;
	}
	
	public int getTotalPoints() {
		int totalPoints = proFaceJab+proBodyJab+proFaceHook+proAllIllegalPunch;
		return totalPoints;
	}
	
	@Override
	public String toString(){
		String str = "Pro Face Jab Points: "+proFaceJab+",Pro Body Jab Points: "+proBodyJab+",Pro Face Hook Points: "+proFaceHook+", Pro All Illegal Punches Points: "+proAllIllegalPunch;
		return str;
	}
}
