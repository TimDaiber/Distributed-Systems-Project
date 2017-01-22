package ie.gmit.sw;

public class Call implements Callable {


	private String entry1;

	private String entry2;
	private String algo;
	private String jobN;
	private Integer res;
	public Call(String entry1, String entry2, String algo, String jobN) {
		super();
		this.entry1 = entry1;
		this.entry2 = entry2;
		this.algo = algo;
		this.jobN = jobN;
	}
	// creating getters and setters
	@Override
	public String getEntry1() {
		// TODO Auto-generated method stub
		return entry1;
	}

	@Override
	public void setEntry1(String entry1) {
		// TODO Auto-generated method stub
		this.entry1 = entry1;
	}

	@Override
	public String getEntry2() {
		// TODO Auto-generated method stub
		return entry2;
	}

	@Override
	public void setEntry2(String entry2) {
		// TODO Auto-generated method stub
		this.entry2=entry2;
	}

	@Override
	public String getAlgorithm() {
		// TODO Auto-generated method stub
		return algo;
	}

	@Override
	public void setAlgorithm(String algo) {
		// TODO Auto-generated method stub
		this.algo = algo;
	}

	@Override
	public String getJobNumber() {
		// TODO Auto-generated method stub
		return jobN;
	}

	@Override
	public void setJobNumber(String jobN) {
		// TODO Auto-generated method stub
		this.jobN=jobN;
	}

	@Override
	public Integer getResult() {
		// TODO Auto-generated method stub
		return res;
	}

	@Override
	public void setResult(int res) {
		// TODO Auto-generated method stub
		this.res=res;
	}

	

}
