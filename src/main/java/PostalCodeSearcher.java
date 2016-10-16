import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import entity.Request;
import entity.Response;

public class PostalCodeSearcher implements RequestHandler<Request, Response> {
	public Response handleRequest(Request input, Context context) {
		return new Response(input.getKeyword(), "神奈川県", "横浜市神奈川区", "栄町17-2", " ポートサイドサクラビル2F");
	}
}
