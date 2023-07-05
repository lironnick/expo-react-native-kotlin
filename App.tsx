import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, NativeModules } from 'react-native';

const { HelloJava } = NativeModules;

export default function App() {

  const handleOnPress = () => {
    HelloJava.sayHello("Module Java ", (err: any, message: any)=> {
      if(err) return console.log(err);
      console.log("message",  message);
    })
  }

  return (
    <View style={styles.container}>
      <Text onPress={handleOnPress} >Esse modulo Java</Text>

      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
