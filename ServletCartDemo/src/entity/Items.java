package entity;

//��Ʒ��
public class Items {

	private int id; // ��Ʒ���
	private String name; // ��Ʒ���
	private String city; // ���
	private int price; // �۸�
	private int number; // ���
	private String picture; // ��ƷͼƬ

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Items(int id,String name,String city,int price,int number,String picture) {
		setName(name);
		setId(id);
		setCity(city);
		setPicture(picture);
		setPrice(price);
		setNumber(number);
		
	}
	
	public Items() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getId()+this.getName().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj instanceof Items){
			Items i = (Items)obj;
			if(this.getId()==i.getId()&&this.getName().equals(i.getName())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	public String toString(){
		return "商品编号："+this.getId()+",商品名称："+this.getName();
	}

}
