pragma solidity >=0.4.21 <0.6.0;
contract Election {
	//Model of Image
	struct Candidate{
	uint id;
	string name;
	uint voteCount;	
	}
	//Storing the accounts who already voted
	mapping(address=>bool) public voters;
	//Fetch the Image
	mapping(uint =>Candidate) public candidates;
	//store the Image count
	uint public candidatesCount ;
	//Execute a command when deploy into Blockchain
	constructor () public{
		addCandidates("Candidate1");
		addCandidates("Candidate2");
	}
	function addCandidates(string memory _name) private {
	candidatesCount++;
	candidates[candidatesCount] = Candidate(candidatesCount,_name,0); 	
	}

	function vote( uint _candidateId) public
	{  
	require(!voters[msg.sender]);
	require( _candidateId > 0 && _candidateId <= candidatesCount);
	voters[msg.sender]=true;
	   candidates[_candidateId].voteCount++;
	}


	//you ether same loud nominee guide myth peace muffin begin wise that lyrics cup
	//metamask extension is used to convert the chrome browser into blockchain server
}