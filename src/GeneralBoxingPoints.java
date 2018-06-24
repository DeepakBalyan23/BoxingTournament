//Points POJO class
public class GeneralBoxingPoints implements Points{
	private int faceJab;
	private int bodyJab;
	private int faceHook;
	private int bodyHook;
	private int faceUpperCut;
	private int bodyUpperCut;
	private int allIllegalPunch;
	
	GeneralBoxingPoints(int faceJab, int bodyJab, int faceHook, int bodyHook, int faceUpperCut, int bodyUpperCut, int allIllegalPunch){
		this.faceJab = faceJab;
		this.bodyJab = bodyJab;
		this.faceHook = faceHook;
		this.bodyHook = bodyHook;
		this.faceUpperCut = faceUpperCut;
		this.bodyUpperCut = bodyUpperCut;
		this.allIllegalPunch = allIllegalPunch;
	}

	public int getFaceJab() {
		return faceJab;
	}

	public void setFaceJab(int faceJab) {
		this.faceJab = faceJab;
	}

	public int getBodyJab() {
		return bodyJab;
	}

	public void setBodyJab(int bodyJab) {
		this.bodyJab = bodyJab;
	}

	public int getFaceHook() {
		return faceHook;
	}

	public void setFaceHook(int faceHook) {
		this.faceHook = faceHook;
	}

	public int getBodyHook() {
		return bodyHook;
	}

	public void setBodyHook(int bodyHook) {
		this.bodyHook = bodyHook;
	}

	public int getFaceUpperCut() {
		return faceUpperCut;
	}

	public void setFaceUpperCut(int faceUpperCut) {
		this.faceUpperCut = faceUpperCut;
	}

	public int getBodyUpperCut() {
		return bodyUpperCut;
	}

	public void setBodyUpperCut(int bodyUpperCut) {
		this.bodyUpperCut = bodyUpperCut;
	}

	public int getAllIllegalPunch() {
		return allIllegalPunch;
	}

	public void setAllIllegalPunch(int allIllegalPunch) {
		this.allIllegalPunch = allIllegalPunch;
	}
	
	public int getTotalPoints() {
		int totalPoints = faceJab+bodyJab+faceHook+bodyHook+faceUpperCut+bodyUpperCut+allIllegalPunch;
		return totalPoints;
	}
	
	@Override
	public String toString(){
		String str = "Face Jab Points: "+faceJab+", Body Jab Points: "+bodyJab+", Face Hook Points: "+faceHook+", Body Hook Points: "+bodyHook+", Face Upper Cut Points: "+faceUpperCut+", Body Upper Cut Points: "+bodyUpperCut+", All Illegal Punches Points: "+allIllegalPunch;
		return str;
	}
}
