enum Role
{
    Admin(1),
    User(2),
    Manager(3);

    private int value;
    Role(int value)
    {
        this.value=value;
    }
    public int getLevel()
    {
        return value;





        
    }
}
class Roles{
    public static void main(String[] args)
    {
        Role r1 = Role.Admin;
        System.out.println(r1.getLevel());
    }
}