
public interface PrintingService {

	// OutOfInkException   - unchecked exception
	// OutOfPaperException - checked exception
	print(Document document) throws OutOfPaperException;
	
	refillPaper();
	
	refullInk();
}
