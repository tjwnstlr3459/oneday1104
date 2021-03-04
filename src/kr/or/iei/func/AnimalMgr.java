package kr.or.iei.func;

public class AnimalMgr<C> {
	private C data;	//tiger bear의 공통된 부모가 오브잭트라서

	public AnimalMgr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalMgr(C data) {
		super();
		this.data = data;
	}

	public C getData() {
		return data;
	}

	public void setData(C data) {
		this.data = data;
	}
	
	

}
