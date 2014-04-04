package linkedList;

/**
 * Created by baylor on 4/3/14.
 */
public class MyLinkedNode<E>
{
	E value;
	MyLinkedNode<E> next;

	MyLinkedNode(E value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return value.toString();
	}
}
