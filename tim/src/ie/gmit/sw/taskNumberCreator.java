package ie.gmit.sw;

public class taskNumberCreator implements creatable{

	private long taskNumber;
	@Override
	// Gets task number
	public long getTaskNumber() {
		// TODO Auto-generated method stub
		return taskNumber;
	}

	// Creates new Tasknumber between 1 and 10 million
	@Override
	public void createNumber() {
		// TODO Auto-generated method stub
		// Creates task number between ten million and one
		this.taskNumber = (long) (Math.random()* 10000000 + 1);
		
	}

}
