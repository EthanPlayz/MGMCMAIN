
public class Command_MGMC extends JavaPlugin;
}

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
  
   if (cmd.getName().equalsIgnoreCase("MGMC") && sender instanceof Player) {
       
       Player player = (Player) sender;
       
       player.sendMessage(ChatColor.YELLOW "Hello, and welcome to the tutorial on how to get started!");
       player.sendMessage(ChatColor.YELLOW "My name is Bot, and yours is.." + player.getName() + " ?");
       player.sendMessage("<" + player.getName + "> : Yes it is my name! How did you know?!");
       player.sendMessage(ChatColor.YELLOW + "BOT: I know everything from top to bottom here!");
       player.sendMessage(ChatColor.RED + "Bot has left, leaving you a not saying.. do /me Hello admins? I need op!");
       return true;
   }
   
   return false;
   
}
