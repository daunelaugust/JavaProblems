class regexMatching {
	public boolean isMatch(String s, String p) {
		
		boolean flag = false;
        // base case
        if(p.length()<2){
        if(p.equals(s)){
            return flag = true;
        }else {
        	return flag;
        }
        }else {
        	char [] chars = s.toCharArray();
        if(p.charAt(1) == '*'){
             for(int i = 0; i<s.length(); i++){
                  if(p.charAt(0) == (chars[i])){
                	 return flag = true;
                  }
             }
        }else if (p.charAt(1)=='.'){
        	return flag = true;
        }
		return flag;
	}
	}
}

                  
              
//              } elseif(p[1].equals(".")){
//              	return true;
//              	}
//              else{return false;
//              }
//              }
//	}
//}
       
        
//        }else{return false; }
//        }else{
//        char [] chars = s.toCharArray();
//        
//        if(p[1].equals("*")){
//        for(int i : chars){
//            if(p[0].equals(chars[i])){
//                return true;
//            }
//        }
//        } elseif(p[1].equals(".")){
//        	return true;
//        	}
//        else{return false;}
//   
//}
//        }
//	}